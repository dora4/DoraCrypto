# At the Industry Fair, Robots Have Learned to "Follow Human Commands"

## — But Your Smartphone Has Yet to Learn to "Protect You"

Shanghai, October 15. The 26th China International Industry Fair (CIIF) enters its fourth day.

Inside the Innovation Science & Technology Pavilion, an embodied intelligence robot carries out an instruction: “Help me place the red component onto the assembly table.” It understands the command, locates the part, picks it up and sets it neatly in place — all in one smooth sequence.

At a neighboring booth, the “Jiumai” vascular health popularization robot developed by Shanghai Ninth People’s Hospital runs a disease-specific large model covering more than 30 types of peripheral vascular diseases. Landau Suiyan’s domestic EUV lithography light source supports chip manufacturing below the 7-nanometer node. Mingshi Medical’s implantable brain-computer interface is helping totally blind patients regain vision.

Embodied intelligence, brain-computer interfaces, EUV lithography — these technologies share one trait: they turn what was once “impossible” into something taken for granted.

Robots understand human speech. The blind can see light. Chip fabrication has pushed past physical limits.

Yet one question finds no answer within this exhibition hall:

**Who protects the most private data stored on your phone?**

## An Experiment You Have Probably Never Tried

Now open the file manager on your smartphone.

Not the photo gallery — the file manager. Browse through its contents.

You may find:

- Photos of the front and back of your ID card (snapped for administrative procedures and forgotten afterwards)
- Screenshots of bank card numbers (saved for fear of forgetting them)
- A PDF copy of your employment contract (signed when you joined the company last year)
- Scanned copy of your child’s birth certificate (used for social insurance applications)
- Electronic medical reports of your parents (obtained from the hospital last visit)
- Screenshots of memos with passwords written down (you know you shouldn’t take screenshots, yet you did)

All these items share one characteristic: they have no dedicated protection.

They sit in your phone’s general storage, sharing exactly the same security level as your food photos, downloaded funny videos and cached short drama clips.

Which is to say: no security at all.

## Cybersecurity at the Industry Fair vs. the Security Vacuum on Your Phone

Cybersecurity is not absent from the Innovation Science & Technology Pavilion at CIIF. Mimic defense systems and AI-powered automated penetration testing agents represent cutting-edge industrial-grade security protection.

But these tools are built for enterprises and critical infrastructure.

What about consumer-facing security tools?

Your mobile operating system comes with a built-in “private safe” or “secure folder”. It provides basic isolation, moving selected files into an area requiring an extra password for access.

Yet it has a fundamental limitation: **encryption keys are managed by the phone manufacturer.**

What does this mean? If the manufacturer’s key management system is breached, your safe may be unlocked. The manufacturer may also hand over keys when legally compelled. You are trusting not cryptography, but a company’s security capabilities and business integrity.

Breach incidents in 2026 show just how fragile this trust can be:

- AI hackers compromised 16 South Korean financial institutions, leaking roughly 100,000 personal records
- Japan’s Times Car car-sharing service exposed data for 6.6 million users plus 1.6 million scanned driver’s licenses
- A Vietnam-linked database was exposed on the public internet, leaking over 220 million flight passenger records
- A South Korean medical beauty platform leaked surgical information for nearly 5,000 Chinese users

These are no small startups. They are large organizations with professional security teams, compliance obligations and dedicated security budgets. If even they cannot safeguard user data — why would your phone’s built-in private safe succeed?

## DoraBox: Build a True Safe Inside Your Smartphone

The difference between **DoraBox** and your phone’s native secure folder can be illustrated with a simple analogy:

Phone built-in safe = the safe in a hotel room. You lock it with a password, but the hotel holds a spare key.

DoraBox = a safe you bring from home. Only you have the key. The hotel does not, and nobody else does.

Technically, this distinction operates on three layers:

**1. Sovereignty over encryption keys.** DoraBox uses AES‑256 encryption — the highest security standard adopted for military and commercial applications. Encryption keys are generated and stored locally on your device. DoraBox itself never holds any keys. There is no remote password reset function for forgotten credentials — and that is precisely its security guarantee. If even you lose your password, that proves the password was sufficiently secure.

**2. Isolated storage.** Encrypted data resides in an independent container, fully separated from the rest of the system. Other apps cannot access files inside the container, even if they obtain system-level permissions.

**3. Stealth and emergency wipe.** DoraBox supports a disguised icon and app name. When someone borrows your phone, they will not even know this is a secure vault. In extreme emergencies, you can destroy the encrypted container with one tap. Once keys are erased, data becomes unrecoverable; anyone who seizes the encrypted files will never decrypt them.

There is another easily overlooked feature: **automatic capture routing.** Photos and screenshots can be automatically directed into encrypted storage, preventing sensitive images from entering the system photo gallery. You will no longer worry that an ID card photo you took appears in the gallery’s “recent items”, exposed to any app with gallery read permissions.

## A Real Afternoon Story

Last Thursday at 3 p.m., a friend messaged me: “I lost my phone.”

She was on a business trip and left her phone in a taxi. By the time she noticed, the taxi had already driven away.

Her first actions: suspend her mobile number, freeze bank cards and reset passwords for all accounts.

Her second step: open her new phone, log into the cloud drive and check for backups.

Her third step: sit on her hotel bed and start wondering — what sensitive material was actually on that phone?

She thought about it for half an hour and reached a conclusion: she was not certain.

She was unsure whether the gallery contained ID photos (possibly, from a previous administrative application). Unsure if contract scans were saved in WeChat favorites (possibly, stored last year). Unsure if password notes existed in memos (possibly, even though she knew better).

This state of uncertainty is what creates the worst anxiety.

If DoraBox had been installed on her phone, all sensitive files would sit inside an encrypted container with keys known only to her. She would only need to complete one major task: suspend her mobile number.

Everything else would be safe. Even if attackers removed the phone’s storage chip, they would only retrieve AES‑256 ciphertext. Without the key, it is just meaningless bytes.

## Lessons from the Industry Fair

Every cutting-edge technology displayed at CIIF answers one question: what can technology do?

Robots can understand human speech. Brain-computer interfaces can restore sight for the blind. EUV lithography can reach below 7 nanometers.

Yet an equally vital question remains: what should technology protect?

As embodied intelligence robots enter factories and homes, as brain-computer interfaces link human brains to computers, and as 6G enables universal connectivity — you will generate ever more data, more sensitive and more valuable than before.

This data deserves protection matching the power of the underlying technology. Not a half-baked safe, not promises that “the provider says it is secure”, but keys you control, control you own, and data sovereignty in your hands.

**DoraBox does something modest: it carves out a private space on your phone that only you can unlock.**

But in a world where robots have learned to listen to humans, your smartphone ought at minimum to learn how to protect you.

**DoraBox — Your most private belongings belong only to you.**

*DoraBox is one product in the Dora series, focused on local encrypted storage for private data.*